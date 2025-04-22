# Rock, Paper, Scissors Game (Java)

A simple and interactive Java console game where you play **Rock, Paper, Scissors** against the computer!

## 🎮 Features

- User selects Rock (0), Paper (1), or Scissors (2)
- Computer randomly selects its move
- Game compares choices and declares a winner
- Handles invalid inputs gracefully
- Instant win/loss/tie feedback

## 🚀 Getting Started

### Requirements

- Java Development Kit (JDK 8 or higher)

### How to Compile

```bash
javac RockPaperScissors.java
```

### How to Run

```bash
java RockPaperScissors
```

## 🖥️ Example Gameplay

```
It's Rock, Paper, Scissors! 
Enter your choice
0:Rock, 1:Paper, 2:Scissors
1
2
You Lose~ :(
```

> The number printed after your input is the computer’s choice (e.g., `2 = Scissors`).

## 🧠 How It Works

- User inputs a number between 0 and 2 representing Rock, Paper, or Scissors
- Computer randomly generates its choice using `Math.random()`
- Logic checks who wins using classic game rules:
  - Rock beats Scissors
  - Scissors beats Paper
  - Paper beats Rock

## ❗ Notes

- If the user enters an invalid number (not 0, 1, or 2), the game prompts an error and exits
- The computer’s move is displayed as a number for now (can be improved to display text)

## 💡 Ideas for Improvement

- Map numeric choices to names (e.g., `0 → Rock`)
- Keep score over multiple rounds
- Add replay option
- Create a GUI version using `Swing` or `JavaFX`

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).

# RockPaperScissors
