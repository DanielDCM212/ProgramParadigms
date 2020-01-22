
#!/usr/bin/env python
# coding: utf-8

import turtle
import math
import random

# Set up screen
wn = turtle.Screen()
wn.bgcolor("white")
wn.title("Tanks war")

turtle.register_shape("spaces.gif")

# Draw border
border_pen = turtle.Turtle()
border_pen.speed(0)
border_pen.color("black")
border_pen.penup()
border_pen.setposition(-300, -300)
border_pen.pendown()
border_pen.pensize(3)
for side in range(4):
    border_pen.fd(600)
    border_pen.lt(90)
border_pen.hideturtle()


# make classes
class tank:
    def __init__(self, clr, angle):
        # create the player turtle
        self.angle = angle
        self.player = turtle.Turtle()
        self.player.color(clr)
        self.player.shape("spaces.gif")
        self.player.penup()
        self.player.speed(0)
        self.player.setposition(0, -250)
        self.player.setheading(angle)
        self.playerspeed = 15
        self.movement = 90
        self.shot = Bullet()

    def move_forward(self):
        y = self.player.ycor()
        if y > 280:
            y = 280
        y += self.playerspeed
        self.player.sety(y)

    def move_right(self):
        x = self.player.xcor()
        if x > 280:
            x = 280
        x += self.playerspeed
        self.player.setx(x)

    def move_left(self):
        x = self.player.xcor()
        x -= self.playerspeed
        if x < -280:
            x = - 280
        self.player.setx(x)

    def move_back(self):
        y = self.player.ycor()
        if y < -280:
            y = -280
        y -= self.playerspeed
        self.player.sety(y)

    def fire(self):
        x = self.player.xcor()
        y = self.player.ycor() + 10
        self.shot.bullet.setposition(x,y)
        self.shot.bullet.showturtle()



class Bullet:

    speedbullet = 20
    state = "ready"

    def __init__(self):
        # create the player´s bullet
        self.bullet = turtle.Turtle()
        self.bullet.color("yellow")
        self.bullet.shape("triangle")
        self.bullet.penup()
        self.bullet.speed(0)
        self.bullet.setheading(90)
        self.bullet.shapesize(0.5, 0.5)
        self.bullet.hideturtle()



jugador1 = tank(clr="red", angle=90)

jugador2 = tank(clr="blue", angle=90)


# Create keyboard bindings
turtle.listen()
turtle.onkey(jugador1.move_forward, "Up")
turtle.onkey(jugador1.move_right, "Right")
turtle.onkey(jugador1.move_left, "Left")
turtle.onkey(jugador1.move_back, "Down")
turtle.onkey(jugador1.fire, "space")

turtle.onkey(jugador2.move_forward, "w")
turtle.onkey(jugador2.move_right, "d")
turtle.onkey(jugador2.move_left, "a")
turtle.onkey(jugador2.move_back, "s")
turtle.onkey(jugador2.fire,"x")

delay = input("finish")
