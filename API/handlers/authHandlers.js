const User = require("../models/User");

// Sign up logic
const signUp = async (req, res) => {
  try {
    const { name, email, password } = req.body;

    // Create a new user
    const user = await User.create({ name, email, password });

    res.status(201).json({ message: "Sign up successful", user });
  } catch (error) {
    console.error(error);
    res.status(500).json({ message: "Sign up failed" });
  }
};

// Sign in logic
const signIn = async (req, res) => {
  try {
    const { email, password } = req.body;

    // Find user by email and password
    const user = await User.findOne({ where: { email, password } });

    if (!user) {
      res.status(404).json({ message: "User not found" });
      return;
    }

    res.status(200).json({ message: "Sign in successful", user });
  } catch (error) {
    console.error(error);
    res.status(500).json({ message: "Sign in failed" });
  }
};

module.exports = { signUp, signIn };
