package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage(); //переходим на страницу групп
    initGroupCreation();    //создаем группу
    fillGroupForm(new GroupData("group", "logo", "comment")); //заполняем форму
    submitGroupCreation();  //сабмитим
    returnToGroupPage();    //переходим на страницу с группами
  }

}
