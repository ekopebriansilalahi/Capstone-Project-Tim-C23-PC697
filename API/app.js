import express from "express";
import router from "./server"; // Ganti "./router" dengan path file yang sesuai

const app = express();

// Mengaitkan router dengan aplikasi utama
app.use("/login", router.login);
app.use("/server", router.server);
app.use("/food", router.food); // Ganti "/food" dengan jalur yang sesuai

// Menjalankan server
app.listen(3000, () => {
  console.log("Server is running on port 3000");
});
