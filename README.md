# Elise 伊莉丝 爬虫框架

![](http://pj99lptli.bkt.clouddn.com/assets/logos/elise-logo.png)

> 名字取材于游戏《英雄联盟》中的一名英雄-蜘蛛女皇。

## 简介

Elise一个开源的商业友好的java爬虫框架。从功能设计上来说，不论是从单线程到多线程还是从单机到分布式或者从个人到企业，本框架都将能够满足其网络抓取需求。

Elise的优势：

* 多线程，速度快

* 模块化设计，扩展性高，支持分布式

* 提供生命周期回调，任务完成，任务取消,下载成功，下载失败等等一系列回调支持

* 支持任务暂停、取消、恢复等功能，并且配套提供了相应的声明周期回调方法

* 对于爬取结果相较于纯文字或者纯html，增加一种富文本结果支持。富文本能将爬取结果段以文本（带链接文本）+图片+音频+视频等内容通过一个结果呈现，这对于开发者而言也许能更好的做内容爬去，而不再需要费劲解析，完整的文章就完整的保存下来。

* 支持xpath/regex/css多模式组合爬取

* 定时爬取(未完成)

* 代理支持

* html unit模拟浏览器
...

## 状态

进行中（每天都在努力的编码中）...一个人的力量有限，希望有人能加入:smile:

目前还没能达到正式版本的状态。不过已经能基本保证正常运行，可以自行clone代码构建运行。

## 使用说明

暂无(目前的api可能不稳定,可自行clone探索)

## 交流反馈

问题和建议反馈：

[Github issues](https://github.com/zidoshare/Elise/issues)

邮箱: [wuhongxu1208@gmail.com](mailto:wuhongxu1208@gmail.com)

## 感谢

本项目的开发离不开前辈的探索，许多思想理念也来自于其他框架：

* [webmagic](https://github.com/code4craft/webmagic):一个开源的Java垂直爬虫框架.

* [Spiderman2](https://gitee.com/l-weiwei/Spiderman2):简单的说，这是一个网页爬虫工具，专门对网页内容进行抓取和解析
