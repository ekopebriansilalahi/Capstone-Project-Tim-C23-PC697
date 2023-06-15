const Food = require("../models/Food");
const Calorie = require("../models/Calorie");
const Allergy = require("../models/Allergy");

const getFoodRecommendations = async (req, res) => {
  const { userId, budget } = req.body;

  try {
    // Get user's calorie information from the database
    const calorieData = await Calorie.findOne({ where: { userId } });

    if (!calorieData) {
      return res
        .status(404)
        .json({ message: "User calorie information not found" });
    }

    const { calories } = calorieData;

    // Get user's allergies from the database
    const allergyData = await Allergy.findOne({ where: { userId } });

    const allergies = allergyData ? allergyData.allergies.split(",") : [];

    // Get food recommendations based on calories, budget, and allergies
    const recommendations = await Food.findAll({
      where: {
        calories: { [Op.lte]: calories },
        price: { [Op.lte]: budget },
        name: { [Op.notIn]: allergies },
      },
    });

    // Return the food recommendations
    res.json({ recommendations });
  } catch (error) {
    // Return error response
    res.status(500).json({ message: "Failed to get food recommendations" });
  }
};

module.exports = {
  getFoodRecommendations,
};
