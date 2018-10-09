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

public class Sights {

    public static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                "Sabarmati Aashram",
                "abarmati Ashram is located in the Sabarmati suburb of Ahmedabad, Gujarat, adjoining the Ashram Road, on the banks of the River Sabarmati, four miles from the town hall. This was one of the residences of Mahatma Gandhi who lived there for about twelve years along with his wife Kasturba Gandhi.Every day Bhagavad Gita was recited here",
                "Gandhi Smarak Sangrahalaya, Ashram Rd, Ahmedabad, Gujarat 380027",
                "79 2755 7277",
                "Open for all the days",
                "Free visit",
                R.drawable.sa
        ));

        list.add(new Location(
                "Kankariya lake",
                "Kankaria Lake, formerly known as Hauj-e-Qutb, is the second largest lake in Ahmedabad, Gujarat, India. It is located in the south-eastern part of the city, in the Maninagar area. It was completed in 1451 during the reign of Sultan Qutb-ud-Din Ahmad Shah II though its origin is placed in the Chaulukya period sometimes",
                " Maninagar, Ahmedabad, Gujarat",
                "none",
                "Open for all the days",
                "50 INR",
                R.drawable.kl
        ));


    }
}
