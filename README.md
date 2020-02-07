# APA_6th_CCLC
使用说明:

1. 这个APA生成器现在暂时只能支持10种比较常见的可能会cite的source, 如果大家有什么新的种类想加景区的可以和我说一下, 我可以添加(相当于后期的补丁, 加完之后你们再把代码更新一下就可以正常使用了), 由于这个考虑到只有我们专业用, 所以我并没有把这个生成器做成一个GUI, 做成GUI反而不好维护, 而是直接放到eclipse console上面进行运行
2. 考虑到每个人的电脑配置的不同, 加上IDE环境里面的encoding schema的不同, 我并没有support italic text output in the console, 但是我给每个需要斜体的地方添加了suffix (i), 你们看到只有就可以知道前面那一段String是需要斜体的, after making the text italic, 就可以删掉(i)
3. 如果在运行过程中看到什么很奇怪的output或者bug, 可以和我说一下, 我到时候改一改, 以便更好地使用
4. 在输入的过程中, 除了提示要求输入, 不要自行在String的前后添加空格或者其他很奇怪的标点符号, 不然会影响output

使用过程: 将NamePrint这个package里面的所有.java文件都复制到你的eclipse里面去, 保证这些.java文件都在NamePrint这个package里面(如果没有叫NamePrint的package就自己创建一个)， 然后保证每个.java文件上面都有一个package NamePrint;的instruction, 最后点开NamePrint.java这个文件在eclipse里面运行就可以开始了

这个生成器采用的reference是
1. Perrin, R. (2017). Pocket guide to APA style, spiral bound version(i) (6th ed.). San Francisco, CA: Cengage Learning.
这本书是我上一个学期的CCLC老师Jenny推荐的
2. Jenny 和 Bernie 有关APA的课件
