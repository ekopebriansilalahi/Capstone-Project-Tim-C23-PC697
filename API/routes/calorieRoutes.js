const express = require("express");
const { calculateCalories } = require("../handlers/calorieHandlers");

const router = express.Router();

router.post("/calculate", calculateCalories);

module.exports = router;
