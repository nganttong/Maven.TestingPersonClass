package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given TODO update with new values/features
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedBloodType = "";
        String expectedEyeColor = "";
        String expectedHairColor = "";
        Integer expectedHeight = Integer.MAX_VALUE;
        Integer expectedWeight = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualBloodType = person.getBloodType();
        String actualEyeColor = person.getEyeColor();
        String actualHairColor = person.getHairColor();
        Integer actualHeight = person.getHeight();
        Integer actualWeight = person.getWeight();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedBloodType, actualBloodType);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFacialFeaturesConstructor() {
        //given
        String expectedName = "Cay";
        String expectedHairColor = "Black";
        String expectedEyeColor = "Brown";
        //when
        Person cay = new Person(expectedName, expectedHairColor, expectedEyeColor);
        //then
        String actualName = cay.getName();
        String actualHairColor = cay.getHairColor();
        String actualEyeColor = cay.getEyeColor();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
    }

    @Test
    public void testFacialFeaturesSetterHair() {
        //given
        Person cay = new Person();
        String expectedHairColor = "Black";
        //when
        cay.setHairColor(expectedHairColor);
        //then
        String actualHairColor = cay.getHairColor();
        Assert.assertEquals(expectedHairColor, actualHairColor);
    }

    @Test
    public void testFacialFeaturesSetterEye() {
        //given
        Person cay = new Person();
        String expectedEyeColor = "Brown";
        //when
        cay.setEyeColor(expectedEyeColor);
        //then
        String actualEyeColor = cay.getEyeColor();
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
    }

    @Test
    public void testBloodTypeConstructor() {
        //given
        String expectedName = "Cay";
        int expectedAge = 28;
        String expectedBloodType = "O Positive";
        //when
        Person cay = new Person(expectedName, expectedAge, expectedBloodType);
        //then
        String actualName = cay.getName();
        int actualAge = cay.getAge();
        String actualBloodType = cay.getBloodType();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedBloodType, actualBloodType);
    }

    @Test
    public void testBloodTypeSetter() {
        //given
        Person cay = new Person();
        String expectedBloodType = "O Positive";
        //when
        cay.setBloodType(expectedBloodType);
        //then
        String actualBloodType = cay.getBloodType();
        Assert.assertEquals(expectedBloodType, actualBloodType);
    }

    @Test
    public void testHeightWeightConstructor() {
        //given
        String expectedName = "Cay";
        int expectedAge = 28;
        int expectedHeight = 67;
        int expectedWeight = 200;
        //when
        Person cay = new Person(expectedName, expectedAge, expectedHeight, expectedWeight);
        //then
        String actualName = cay.getName();
        int actualAge = cay.getAge();
        int actualHeight = cay.getHeight();
        int actualWeight = cay.getWeight();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testHeightSetter() {
        //given
        Person cay = new Person();
        int expectedHeight = 67;
        //when
        cay.setHeight(expectedHeight);
        //then
        int actualHeight = cay.getHeight();
        Assert.assertEquals(expectedHeight, actualHeight);
    }

    @Test
    public void testWeightSetter() {
        //given
        Person cay = new Person();
        int expectedWeight = 200;
        //when
        cay.setWeight(expectedWeight);
        //then
        int actualWeight = cay.getWeight();
        Assert.assertEquals(expectedWeight, actualWeight);
    }
}

