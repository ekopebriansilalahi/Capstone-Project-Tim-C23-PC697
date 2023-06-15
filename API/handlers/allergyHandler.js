const Allergy = require("../models/Allergy");

const addAllergy = async (req, res) => {
  const { userId, allergies } = req.body;

  try {
    // Save the allergies for the user in the database
    await Allergy.create({ userId, allergies });

    // Return success response
    res.json({ message: "Allergies added successfully" });
  } catch (error) {
    // Return error response
    res.status(500).json({ message: "Failed to add allergies" });
  }
};

module.exports = {
  addAllergy,
};
