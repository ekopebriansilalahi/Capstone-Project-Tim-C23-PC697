const express = require("express");
const bodyParser = require("body-parser");
const authRoutes = require("./routes/authRoutes");
const calorieRoutes = require("./routes/calorieRoutes");
const allergyRoutes = require("./routes/allergyRoutes");
const foodPreferenceRoutes = require("./routes/foodPreferenceRoutes");

const app = express();
const port = 8080;

app.use(bodyParser.json());

// Routes
app.use("/auth", authRoutes);
app.use("/calorie", calorieRoutes);
app.use("/allergy", allergyRoutes);
app.use("/food-preference", foodPreferenceRoutes);

// Start the server
app.listen(port, () => {
    console.log(`Server running on port ${port}`);
  });
