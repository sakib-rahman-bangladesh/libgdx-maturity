package com.udacity.gamedev.drawaspiral;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;

/**
 * TODO: Start here
 *
 * In this exercise we have a project that draws a number of concentric rectangles as specified in
 * the COILS constant. The space between the rectangles is given by xStep and yStep.
 *
 * The rectangles are drawn using four lines between five points. Your task is to adjust the first
 * and last point such that each rectangle turns into a coil that meets up with the neighboring
 * coils inside and outside of it.
 */

public class DrawASpiral extends ApplicationAdapter {

    // How many rectangles/coils to draw
    private static final int COILS = 20;
    ShapeRenderer shapeRenderer;

    @Override
    public void create() {
        shapeRenderer = new ShapeRenderer();
    }

    @Override
    public void dispose() {
        super.dispose();
        shapeRenderer.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeType.Line);

        // Responsive
        int screenWidth = Gdx.graphics.getWidth();
        int screenHeight = Gdx.graphics.getHeight();
        int xStep = screenWidth / 2 / COILS;
        int yStep = screenHeight / 2 / COILS;

        /*
        xStep = screenWidth/2;
        yStep = screenHeight/2/COILS;
        shapeRenderer.point(xStep, yStep, 0);

        xStep = screenWidth/2;
        yStep = 2 * screenHeight/2/COILS;
        shapeRenderer.point(xStep, yStep, 0);

        xStep = screenWidth/2;
        yStep = 3 * screenHeight/2/COILS;
        shapeRenderer.point(xStep, yStep, 0);
        */

        // screenWidth & screenHeight ??

        // DEBUG: Analysis to get solution
        /*
        Vector2 point1, point2;
        int x, y;
        int ratio = 5;

        x = 0;
        y = 0;
        point1 = new Vector2(x, y);
        point2 = new Vector2(screenWidth - x, y);
        shapeRenderer.line(point1, point2);

        x = 1 * ratio;
        y = 1 * ratio;
        point1 = new Vector2(x, y);
        point2 = new Vector2(screenWidth - x, y);
        shapeRenderer.line(point1, point2);

        x = 1;
        y = 1;
        point1 = new Vector2(x, y);
        point2 = new Vector2(screenWidth, y);
        shapeRenderer.line(point1, point2);

        x = 1;
        y = 2;
        point1 = new Vector2(x, y);
        point2 = new Vector2(screenWidth, y);
        shapeRenderer.line(point1, point2);

        x = 1;
        y = 3;
        point1 = new Vector2(x, y);
        point2 = new Vector2(screenWidth - 10, y);
        shapeRenderer.line(point1, point2);

        x = 3 * ratio;
        y = 3 * ratio;
        point1 = new Vector2(x, y);
        point2 = new Vector2(screenWidth - x, y);
        shapeRenderer.line(point1, point2);

        x = 4;
        y = 4 * ratio;
        point1 = new Vector2(x, y);
        point2 = new Vector2(screenWidth - x, y);
        shapeRenderer.line(point1, point2);

        x = 5;
        y = 5 * ratio;
        point1 = new Vector2(x, y);
        point2 = new Vector2(screenWidth - x, y);
        shapeRenderer.line(point1, point2);
        */

        // Sakib's solution
        // accidental-math
        /*
        for (int i = 0; i < COILS; i++) {
            int x = xStep * i;
            int y = yStep * i;

            Vector2 point1 = new Vector2(x, yStep);
            Vector2 point2 = new Vector2(screenWidth - x, y);

            shapeRenderer.line(point1, point2);
        }
        */

        // Made like exercise solution without exercise help
        // Now, fulfil requirement: DrawASpiral
        /*
        for (int ratio = 0; ratio < COILS; ratio++) {
            int x = xStep * ratio;
            int y = yStep * ratio;

            Vector2 point1 = new Vector2(x, y);
            Vector2 point2 = new Vector2(screenWidth - x, y);

            Vector2 point3 = new Vector2(screenWidth - x, screenHeight - y);
            Vector2 point4 = new Vector2(x, screenHeight - y);

            shapeRenderer.line(point1, point2);
            shapeRenderer.line(point2, point3);
            shapeRenderer.line(point1, point4);
            shapeRenderer.line(point3, point4);
        }
        */

        // TODO: (sakib cmd) DEBUG: Manual solution of DrawASpiral
        /*
        int increment, x, y;

        increment = 0;
        xStep = 10;
        yStep = 10;

        x = xStep * increment; y = yStep * increment;
        Vector2 p1 = new Vector2(x, y);
        Vector2 p2 = new Vector2(screenWidth - x, y);
        Vector2 p3 = new Vector2(screenWidth - x, screenHeight - y);
        Vector2 p4 = new Vector2(x + increment + xStep, screenHeight - y);
        Vector2 p5 = new Vector2(x + increment + yStep, y + increment + yStep);
        shapeRenderer.line(p1, p2);
        shapeRenderer.line(p2, p3);
        shapeRenderer.line(p4, p3);
        shapeRenderer.line(p4, p5);

        increment = 1;
        xStep = 10;
        yStep = 10;

        x = xStep * increment; y = yStep * increment;
        p1 = new Vector2(x, y);
        p2 = new Vector2(screenWidth - x, y);
        p3 = new Vector2(screenWidth - x, screenHeight - y);
        p4 = new Vector2(x + increment + xStep, screenHeight - y);
        p5 = new Vector2(x + increment + yStep, y + increment + yStep);
        shapeRenderer.line(p1, p2);
        shapeRenderer.line(p2, p3);
        shapeRenderer.line(p4, p3);
        shapeRenderer.line(p4, p5);

        increment = 2;
        xStep = 10;
        yStep = 10;

        x = xStep * increment; y = yStep * increment;
        p1 = new Vector2(x, y);
        p2 = new Vector2(screenWidth - x, y);
        p3 = new Vector2(screenWidth - x, screenHeight - y);
        p4 = new Vector2(x + increment + xStep, screenHeight - y);
        p5 = new Vector2(x + increment + yStep, y + increment + yStep);
        shapeRenderer.line(p1, p2);
        shapeRenderer.line(p2, p3);
        shapeRenderer.line(p4, p3);
        shapeRenderer.line(p4, p5);
        */


        // TODO: (sakib cmd) Now, to do this continuously, Multiply with decremental ratio within a loop
        // NOT Accurate
        /*
        int x, y;
        Vector2 p1, p2, p3, p4, p5;
        for (int increment = 0; increment < COILS; increment++) {
            x = xStep * increment; y = yStep * increment;
            p1 = new Vector2(x, y);
            p2 = new Vector2(screenWidth - x, y);
            p3 = new Vector2(screenWidth - x, screenHeight - y);
            p4 = new Vector2(x + increment + xStep, screenHeight - y);
            p5 = new Vector2(x + increment + yStep, y + increment + yStep);

            shapeRenderer.line(p1, p2);
            shapeRenderer.line(p2, p3);
            shapeRenderer.line(p4, p3);
            shapeRenderer.line(p4, p5);
        }
        */

        // TODO: (sakib cmd) DEBUG and Make Accurate
        int x, y;
        Vector2 p1, p2, p3, p4, p5;
        for (int increment = 1; increment < COILS; increment++) {

            x = xStep * increment;
            y = yStep * increment;

            p1 = new Vector2(x, y);
            p2 = new Vector2(screenWidth - x, y);
            p3 = new Vector2(screenWidth - x, screenHeight - y);
            p4 = new Vector2(x + increment + xStep, screenHeight - y);
            p5 = new Vector2(x + increment + xStep, y + increment + yStep);

            shapeRenderer.line(p1, p2);
            shapeRenderer.line(p2, p3);
            shapeRenderer.line(p4, p3);
            shapeRenderer.line(p4, p5);
        }

        /*
        // Automatic: DrawASpiral
        for (int ratio = 0; ratio < COILS; ratio++) {
            int x = xStep * ratio;
            int y = yStep * ratio;

            Vector2 point1 = new Vector2(x, y);
            Vector2 point2 = new Vector2(screenWidth - x, y);

            Vector2 point3 = new Vector2(screenWidth - x, screenHeight - y);
            Vector2 point4 = new Vector2(x, screenHeight - y);

            shapeRenderer.line(point1, point2);
//            shapeRenderer.line(point2, point3);
//            shapeRenderer.line(point1, point4);
//            shapeRenderer.line(point3, point4);
        }
        */

        /*
        for (int i = 0; i < COILS; i++) {
            int xOffset = xStep * i;
            int yOffset = yStep * i;

            // TODO: Make this coil reach back to the outer coil
            Vector2 point1 = new Vector2(xOffset, yOffset);
            Vector2 point2 = new Vector2(screenWidth - xOffset, yOffset);
            Vector2 point3 = new Vector2(screenWidth - xOffset, screenHeight - yOffset);
            Vector2 point4 = new Vector2(xOffset, screenHeight - yOffset);

            // TODO: Make this coil stop before connecting back to itself
            Vector2 point5 = new Vector2(xOffset, yOffset);

            // Practice previous topics: Point and line drawing with color
//            shapeRenderer.point(50, 100, 0);
//            shapeRenderer.point(600, 100, 0);
//            shapeRenderer.setColor(Color.MAGENTA);
//            shapeRenderer.line(0, 0, 100, 100);
//
//            // We can also do fancy things like gradients
//            shapeRenderer.line(100, 0, 100, 100, Color.BLUE, Color.RED);
//
//            Vector2 v0 = new Vector2(100, 200);
//            Vector2 v1 = new Vector2(400, 200);
//            shapeRenderer.setColor(Color.CYAN);
//            shapeRenderer.line(v0, v1);
//

//            shapeRenderer.setColor(Color.WHITE);
            shapeRenderer.line(point1, point2);
            shapeRenderer.line(point2, point3);
//            shapeRenderer.line(point3, point4);
//            shapeRenderer.line(point4, point5);
        }
        */

        shapeRenderer.end();
    }
}

// TODO: Challenge - Add truncated corners to the spiral
