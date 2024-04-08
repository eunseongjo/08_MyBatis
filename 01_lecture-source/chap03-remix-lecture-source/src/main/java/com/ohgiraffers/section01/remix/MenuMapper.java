package com.ohgiraffers.section01.remix;

import java.util.List;

public interface MenuMapper {

    List<MenuDTO> selectionAllMenu();


    MenuDTO selectMenuByCode(int code);

    int insertMenu(MenuDTO menu);

    int updateMenu(MenuDTO menu);

    int deleteMenu(int code);
}
