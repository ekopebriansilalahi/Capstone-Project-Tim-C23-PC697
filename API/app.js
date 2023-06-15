const express = require("express");
const bodyParser = require("body-parser");
const authRoutes = require("./routes/authRoutes");
const calorieRoutes = require("./routes/calorieRoutes");
const allergyRoutes = require("./routes/allergyRoutes");
const foodPreferenceRoutes = require("./routes/foodPreferenceRoutes");

const app = express();

app.use(bodyParser.json());

// Routes
app.use("/auth", authRoutes);
app.use("/calorie", calorieRoutes);
app.use("/allergy", allergyRoutes);
app.use("/food-preference", foodPreferenceRoutes);

// Start the server
app.listen(3003, () => {
  console.log("Server is running on port 3003");
});
