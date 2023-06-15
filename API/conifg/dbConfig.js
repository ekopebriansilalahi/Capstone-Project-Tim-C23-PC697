const { Sequelize } = require("sequelize");

const sequelize = new Sequelize("anakosehat", "root", "anakosehat", {
  host: "34.101.218.62",
  dialect: "mysql",
});

module.exports = sequelize;
