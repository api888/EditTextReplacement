# 让EditText具有文字自动转换的功能

想让EditText具备有文字自动转换的功能，
例如：当用户输入“1”之后自动转换为“一”或“壹”，当用户输入“a”之后自动转换为“A”。其实做法很简单。


首先定义一个类继承ReplacementTransformationMethod类并重写两个方法。这个类位于android.text.method包中。

比如,以自动将用户输入的小写字母转换为大写为例,定义一个ReplacementTransformationMethod类.

```

```