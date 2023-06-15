const express = require("express");
const {
  getFoodRecommendations,
} = require("../handlers/foodPreferenceHandlers");

const router = express.Router();

router.post("/recommendations", getFoodRecommendations);

module.exports = router;
