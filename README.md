# DES103 – Object-Oriented Programming (Java Swing)

Lab work and practice projects from **DES103 Object-Oriented Programming** at the
Sirindhorn International Institute of Technology (SIIT), Thammasat University – Year 1, Term 2.

The projects use Java Swing to build GUIs and cover layout managers, custom 2D painting,
event handling (action, item, mouse and keyboard events), inner classes and `javax.swing.Timer`
animation.

## Labs

| Folder | What it does | Concepts | Main class |
|---|---|---|---|
| [Lab06-Microwave](labs/Lab06-Microwave) | Front panel of a microwave oven | `BorderLayout`, `GridLayout`, nested panels | `MicrowaveTest` |
| [Lab07-ElectricFan](labs/Lab07-ElectricFan) | Drawing of an electric fan | `paintComponent`, arcs, polygons, round rects | `ElectricFanTest` |
| [Lab08-MovingMessagePanel](labs/Lab08-MovingMessagePanel) | Type a message, move it with buttons or the mouse, switch background colour | `ActionListener`, `ItemListener`, `MouseMotionListener`, `ButtonGroup` | `MovingMessagePanelTest` |
| [Lab08-Snowman](labs/Lab08-Snowman) *(extra)* | Movable snowman with toggleable hat, buttons and arms | Event handling + custom painting | `SnowmanTest` |
| [Lab09-BMICalculator](labs/Lab09-BMICalculator) | BMI calculator with input validation | Text input, parsing, exception handling | `BMICalculatorTest` |
| [Lab09-KeyboardEvent](labs/Lab09-KeyboardEvent) | Type text on the panel and drag it with the mouse | `KeyListener`, focus | `KeyboardEventTest` |
| [Lab09-ScribblePane](labs/Lab09-ScribblePane) | Draw with left mouse, erase with right, click to clear | `MouseListener`, `MouseMotionListener` | `ScribblePane` |
| [Lab09-KeyboardEventDemo](labs/Lab09-KeyboardEventDemo) *(extra)* | Shows the last key typed | `KeyListener` | `KeyboardEventDemo` |
| [Lab09-MouseEventDemo](labs/Lab09-MouseEventDemo) *(extra)* | Drag to draw filled rectangles, right-drag to erase | Mouse press/release events | `MouseEventDemoTest` |
| [Lab09-ProjectileMotion](labs/Lab09-ProjectileMotion) *(extra)* | Projectile range calculator, R = v² sin 2θ / g | `GridLayout`, input validation | `ProjectileMotion` |
| [Lab10-CatchingFlashBall](labs/Lab10-CatchingFlashBall) | Click the ball that jumps to a random spot every second | `Timer`, inner-class listeners | `CatchingFlashBallTest` |
| [Lab10-KeyboardGame](labs/Lab10-KeyboardGame) | Type the random letter before it changes to score | `Timer` + `KeyListener` | `KeyboardGameTest` |

## Practice projects

Extra exercises written while preparing for the exam.

| Folder | What it does | Main class |
|---|---|---|
| [AnimatedFan](practice/AnimatedFan) | The Lab 7 fan, animated: button 0 turns it off, 1–3 set the speed | `AnimatedFanTest` |
| [ArcBump](practice/ArcBump) | Two arcs slide toward each other until they collide; computes arc length | `ArcBumpTest` |
| [PacmanAnimation](practice/PacmanAnimation) | Pac-Man moves on a timer and eats a pizza slice | `PacmanAnimationTest` |
| [PacmanGame](practice/PacmanGame) | Reach the pizza with the arrow key before the 50-second countdown ends | `PacmanGameTest` |
| [PaintCanvas](practice/PaintCanvas) | Paint program with preset/custom RGB colours and brush sizes | `PaintCanvasTest` |

## Running

Requires JDK 8 or newer. Each project is self-contained in its own `src/` folder.

```bash
cd labs/Lab10-KeyboardGame
javac -d out src/*.java
java -cp out KeyboardGameTest
```

Replace the folder and main class with any row from the tables above. The projects can also be
imported into Eclipse or IntelliJ as plain Java projects with `src/` as the source folder.
