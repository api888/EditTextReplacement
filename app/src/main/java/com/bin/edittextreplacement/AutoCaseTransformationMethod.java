package com.bin.edittextreplacement;

import android.text.method.ReplacementTransformationMethod;

/**
 * @author: HBB
 * @Time: 2020/9/29
 * @Description:
 */
public class AutoCaseTransformationMethod extends ReplacementTransformationMethod {
    /**
     * 获取原有的字符，就是用户可能会输入的而且你也希望改变的字符。
     *
     * @return
     */
    @Override
    protected char[] getOriginal() {
        return new char[]{'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z'};
    }

    /**
     * 获取要替换的字符。
     *
     * @return 将你希望用来替换的字符数组返回。这里返回的字符数组中的顺序
     * 要和{@link #getOriginal()}方法的返回值对应起来，
     * 如果{@link #getOriginal()}方法的返回值的第一个元素是a，
     * 而该方法返回值的第一个元素是B，那么当用户输入a之后就会自动转换为B。
     * 还要注意的是，该方法的返回值的数组长度要个{@link #getOriginal()}方法的返回值的数组长度保持一致。
     */
    @Override
    protected char[] getReplacement() {
        return new char[]{'A', 'B', 'C', 'D', 'E',
                'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    }
}
