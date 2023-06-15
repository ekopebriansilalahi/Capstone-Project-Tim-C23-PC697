const { Sequelize, DataTypes } = require("sequelize");
const sequelize = require("../config/dbConfig");

const Allergy = sequelize.define("Allergy", {
  userId: {
    type: DataTypes.INTEGER,
    allowNull: false,
  },
  allergies: {
    type: DataTypes.STRING,
    allowNull: false,
  },
});

module.exports = Allergy;
