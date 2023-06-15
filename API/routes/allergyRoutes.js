const express = require("express");
const { addAllergy } = require("../handlers/allergyHandlers");

const router = express.Router();

router.post("/add", addAllergy);

module.exports = router;
