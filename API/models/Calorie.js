const { Sequelize, DataTypes } = require("sequelize");
const sequelize = require("../config/dbConfig");

const Calorie = sequelize.define("Calorie", {
  sex: {
    type: DataTypes.STRING,
    allowNull: false,
  },
  weight: {
    type: DataTypes.FLOAT,
    allowNull: false,
  },
  height: {
    type: DataTypes.FLOAT,
    allowNull: false,
  },
});

module.exports = Calorie;
