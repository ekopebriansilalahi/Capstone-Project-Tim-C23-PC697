const Calorie = require("../models/Calorie");

const calculateCalories = async (req, res) => {
  const { sex, weight, height, age } = req.body;

  try {
    let calories = 0;

    // Perform calorie calculation logic here based on sex, berat, and tinggi
    //, menggunakan rumus Harris-Benedict
    if (sex === "male") {
      calories = 10 * weight + 6.25 * height - 5 * age + 5;
    } else if (sex === "female") {
      calories = 10 * weight + 6.25 * height - 5 * age - 161;
    }

    // Save the calculated calories in the database
    const calorieData = await Calorie.create({ sex, weight, height, calories });

    // Return the calculated calories and success message
    res.status(200).json({
      calories: calorieData.calories,
      message: "Calories calculated successfully",
    });
  } catch (error) {
    // Return error response
    res.status(500).json({ message: "Failed to calculate calories" });
  }
};

module.exports = {
  calculateCalories,
};
