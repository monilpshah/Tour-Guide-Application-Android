/*
 * PROJECT LICENSE
 *
 * This project was submitted by Lara Martín as part of the Nanodegree At Udacity.
 *
 * As part of Udacity Honor code, your submissions must be your own work, hence
 * submitting this project as yours will cause you to break the Udacity Honor Code
 * and the suspension of your account.
 *
 * Me, the author of the project, allow you to check the code as a reference, but if
 * you submit it, it's your own responsibility if you get expelled.
 *
 * Copyright (c) 2017 Lara Martín
 *
 * Besides the above notice, the following license applies and this license notice
 * must be included in all works derived from this project.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package monu.monilpshah.amd;

import android.content.Context;

import java.util.List;

public class Shops {

    public static void initShopsList(List<Location> list, Context context) {

        list.add(new Location(
                "Himalaya mall",
                "",
                "Drive In Rd, Nilmani Society, Gurukul, Ahmedabad, Gujarat 380006",
                "+91 96246 83068",
                "Opens 10AM Wed Mon 10AM–10PM Tue-Sun 7:30AM–10PM",
                "none",
                R.drawable.hm
        ));

        list.add(new Location(
                "Ahmedabad One mall",
                "AHMEDABAD ONE is a shopping mall located at Vastrapur, Ahmedabad, India. The mall was opened in October 2011 and is the largest mixed used city centre in Ahmedabad. The mall was first named as Alpha One.",
                "Plot No-216, T.P Scheme-1, Near Vastrapur Lake, Vastrapur, Ahmedabad, Gujarat 380054",
                "79 4019 3672",
                "10 AM to 10 PM",
                "none",
                R.drawable.ao
        ));

    }
}
