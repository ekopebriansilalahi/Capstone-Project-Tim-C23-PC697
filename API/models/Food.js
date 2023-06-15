const { Sequelize, DataTypes } = require("sequelize");
const sequelize = require("../config/dbConfig");

const Food = sequelize.define("Food", {
  name: {
    type: DataTypes.STRING,
    allowNull: false,
  },
  calories: {
    type: DataTypes.FLOAT,
    allowNull: false,
  },
});

module.exports = Food;
