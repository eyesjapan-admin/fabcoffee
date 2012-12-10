**[Fabcoffee](http://fabcoffee.org)**
---------------

Fabcoffee is a fun project started with an idea to bring together modern technologies, lego and…coffee. Have you ever seen latte art? Did you wanted to do something similar but in a more easy way? If that's the case, then this project might be interesting for you!

Status
---------------
We are proud to announce an initial release of the project!

Current Version 1.0.

Hardware
========

To minimize effort and costs for initial latte printer prototype model was designed with the following key parts:
- 2 motors to implement movement towards X and Y axis
- 1 motor for compressor
- 1 500ml syringe

For details please see blueprints directory.

Software
========
Only low-level code for LEGO NXT to control linear movements and  compressor. Unfortunately, at the moment coffee has to be released manually using switch from Pneumatics Kit.

Dependency
---------------
Fabcoffee requires LEGO NXT 2.0 brick to be flashed with leJOS Framework 0.9.1b3.

Flashing procedure differs for specific platform. More details can be found [here](http://lejos.sourceforge.net/nxt/nxj/tutorial/Preliminaries/GettingStarted.htm)

More updates coming soon. Stay tuned.

Roadmap
---------------

1.5
====
- Andoroid Apps for Control Head
- Bluetooth Communication

2.0
====
- Print photographic data ( raster image is processed into svg path data which is actually used for plotting the final image )
- Extended resolution and more precise printing ( more dpi )

How to use
---------------

For development environment we recommend to use Eclipse, because  it is able to build leJOS specific software, applications that can be use on the desktop and android. More details [here](http://lejos.sourceforge.net/nxt/nxj/tutorial/Preliminaries/UsingEclipse.htm)

1. Get leJOS package for your platform from [here](http://lejos.sourceforge.net/nxj-downloads.php)
2. Clone project code
3. To build and upload application to the NXT brick follow guidelines from [here](http://lejos.sourceforge.net/nxt/nxj/tutorial/Preliminaries/CompileAndRun.htm)
4. Guidelines for working with android devices can be found [here](http://lejos.sourceforge.net/nxt/nxj/tutorial/Android/Android.htm)

Directory structure
---------------
- blueprints - plotter model in Lego Digital Designer with parts list necessary for actually making one
- controller - controller for Android ( including part with NXT )
- src - sources for the Maker Tokyo 2012 demo

Authors
---------------
This project was possible because of cooperation between [Eyes, JAPAN Co. Ltd.](http://nowhere.co.jp) and [University of Wuppertal](http://www.uni-wuppertal.de).

Contribution
---------------
If you are interested in the project and/or would like to contribute, please fork it ( or drop an e-mail to info@fabcoffee.org ).

Licence
---------------
<a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/3.0/deed.ja"><img alt="クリエイティブ・コモンズ・ライセンス" style="border-width:0" src="http://i.creativecommons.org/l/by-nc-sa/3.0/88x31.png" /></a><br /><span xmlns:dct="http://purl.org/dc/terms/" property="dct:title">FabCoffee</span> by <a xmlns:cc="http://creativecommons.org/ns#" href="http://fabcoffee.org/" property="cc:attributionName" rel="cc:attributionURL">Eyes, JAPAN Co. Ltd. and BERGISCHE UNIVERSITÄT WUPPERTAL</a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/3.0/deed.ja">Creative Commons 表示 - 非営利 - 継承 3.0 非移植 License</a>.<br /><a xmlns:dct="http://purl.org/dc/terms/" href="http://fabcoffee.org/" rel="dct:source">http://fabcoffee.org/</a>にある作品に基づいている。<br />このライセンスで許諾される範囲を超えた利用の可能性については以下のアドレスもご覧下さい。 <a xmlns:cc="http://creativecommons.org/ns#" href="https://github.com/eyesjapan/fabcoffee/" rel="cc:morePermissions">https://github.com/eyesjapan/fabcoffee/</a>
