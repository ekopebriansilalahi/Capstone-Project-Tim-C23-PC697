const foods = require("./foods");

const getAllFoods = (request, h) => {
  const { budget, nutrition } = request.query;

  let recommendedFoods = foods;

  if (budget) {
    recommendedFoods = recommendedFoods.filter((food) => food.price <= budget);
  }

  if (nutrition) {
    recommendedFoods = recommendedFoods.filter((food) =>
      food.nutrition.includes(nutrition)
    );
  }

  return h.response({
    status: "success",
    data: {
      foods: recommendedFoods,
    },
  });
};

module.exports = {
  getAllFoods,
};
