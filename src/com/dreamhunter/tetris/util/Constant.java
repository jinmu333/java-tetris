package com.dreamhunter.tetris.util;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 常量类
 */

public class Constant {
    // 窗口尺寸
    public static final int FRAME_WIDTH = 300;
    public static final int FRAME_HEIGHT = 700;

    // 游戏标题
    public static final String GAME_TITLE = "俄罗斯方块";

    // 窗口位置
    public static final int FRAME_X = 600;
    public static final int FRAME_Y = 100;

    // 俄罗斯方块枚举
    public static final List<Integer> INIT_BLOCK_LIST = Arrays.asList(
            0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00, 0x00
    );
    public static final List<List<Integer>> BLOCK_I = Arrays.asList(
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x10, 0x10, 0x10, 0x10
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x78, 0x00
            )
    );
    public static final List<List<Integer>> BLOCK_T = Arrays.asList(
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x10, 0x18, 0x10
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x38, 0x10
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x10, 0x30, 0x10
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x10, 0x38, 0x00
            )
    );
    public static final List<List<Integer>> BLOCK_L = Arrays.asList(
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x30, 0x10, 0x10
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x08, 0x38
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x10, 0x10, 0x18
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x38, 0x20
            )
    );
    public static final List<List<Integer>> BLOCK_J = Arrays.asList(
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x18, 0x10, 0x10
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x38, 0x08
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x10, 0x10, 0x30
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x20, 0x38
            )
    );

    public static final List<List<Integer>> BLOCK_O = Collections.singletonList(
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x30, 0x30
            )
    );

    public static final List<List<Integer>> BLOCK_Z = Arrays.asList(
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x60, 0x30
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x10, 0x30, 0x20
            )
    );

    public static final List<List<Integer>> BLOCK_S = Arrays.asList(
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x30, 0x60
            ),
            Arrays.asList(
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x20, 0x30, 0x10
            )
    );

    // 所有方块
    public static List<List<List<Integer>>> ALL_BLOCK = Arrays.asList(
            BLOCK_I, BLOCK_L, BLOCK_T, BLOCK_J, BLOCK_O, BLOCK_Z, BLOCK_S
    );

    // 方块大小
    public static final int BLOCK_SIZE = 30;
    // 方块下落速度
    public static final int BLOCK_SPEED = 20;
    // 方块填满的行的值
    public static final int FULL_BLOCK_ROW = 0x3ff;
    // 方块为空的行的值
    public static final int BLANK_BLOCK_ROW = 0x00;

    // 方块行数列数
    public static final int BLOCK_ROW_SIZE = 20;
    public static final int BLOCK_COLUMN_SIZE = 10;

    // 方块颜色
    public static final Color BLOCK_COLOR = new Color(0x89c2e8);
    // 方块边框颜色
    public static final Color BLOCK_BORDER_COLOR = new Color(0xffffff);

    // 游戏背景色
    public static final Color BG_COLOR = new Color(0xfbe7a6);

    // 游戏刷新率
    public static final int FPS = 1000 / 30;

    // 字体
    public static final Font APP_FONT = new Font("华文琥珀", Font.ITALIC, 24);// 字体

    public static final String SCORE_FILE_PATH = "resources/score"; // 分数文件路径

}
