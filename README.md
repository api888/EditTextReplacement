# 让EditText具有文字自动转换的功能

想让EditText具备有文字自动转换的功能，
例如：当用户输入“1”之后自动转换为“一”或“壹”，当用户输入“a”之后自动转换为“A”。其实做法很简单。


- 首先定义一个类继承ReplacementTransformationMethod类并重写两个方法。这个类位于android.text.method包中。

比如,以自动将用户输入的小写字母转换为大写为例,定义一个ReplacementTransformationMethod类.

```
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
```

- 然后调用EditText的setTransformationMethod方法将我们的AutoCaseTransformationMethod对象作为参数传递进去就可以了。

```
 et.setTransformationMethod(new AutoCaseTransformationMethod());
```