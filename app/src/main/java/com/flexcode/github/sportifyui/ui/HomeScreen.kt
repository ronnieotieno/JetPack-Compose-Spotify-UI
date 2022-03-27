package com.flexcode.github.sportifyui.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.flexcode.github.sportifyui.PlayList
import com.flexcode.github.sportifyui.R
import com.flexcode.github.sportifyui.RoundAndBoxPlayList
import com.flexcode.github.sportifyui.ui.theme.backgroundColor
import com.flexcode.github.sportifyui.ui.theme.tileBackground
import com.flexcode.github.sportifyui.ui.theme.white

@Composable
@Preview
fun HomeScreen() {

    Box(
        modifier = Modifier
            .background(backgroundColor)
            .fillMaxSize()
            .padding(top = 10.dp)
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(ScrollState(0), true)
                .padding(bottom = 100.dp)
        ) {
            Greetings()
            PlayListSection(
                "Nikita Kering'",
                "On Repeat",
                R.drawable.nikita,
                R.drawable.spot_repeat
            )
            PlayListSection(
                "Hot Hits Kenya",
                "Daily Mix 1",
                R.drawable.hot_hits,
                R.drawable.daily_mix_1
            )
            PlayListSection(
                "Dua Lipa",
                "Daily Mix 2",
                R.drawable.dua_lipa,
                R.drawable.daily_mix_2
            )
            ListsSection(
                title = "Made for Felix",
                list = listOf(
                    PlayList(R.drawable.dua_lipa, "Business wars", "Show Wondery"),
                    PlayList(R.drawable.nikita, "Business wars", "Show Wondery"),
                    PlayList(R.drawable.daily_mix_1, "Business wars", "Show Wondery"),
                    PlayList(R.drawable.daily_mix_2, "Business wars", "Show Wondery")
                ), false
            )
            RoundAndBoxSection(
                title = "Recently Played", list = listOf(
                    RoundAndBoxPlayList(R.drawable.nikita, "Nikita Kering'", true),
                    RoundAndBoxPlayList(R.drawable.spot_repeat, "On Repeat", false),
                    RoundAndBoxPlayList(R.drawable.dua_lipa, "Dua Lipa", true),
                    RoundAndBoxPlayList(
                        R.drawable.daily_mix_2, "Daily Mix 2", false
                    )
                )
            )
            ListsSection(
                title = "Show Popular with friends",
                list = listOf(
                    PlayList(R.drawable.dua_lipa, "Business wars", "Show Wondery"),
                    PlayList(R.drawable.nikita, "Business wars", "Show Wondery"),
                    PlayList(R.drawable.daily_mix_1, "Business wars", "Show Wondery"),
                    PlayList(R.drawable.daily_mix_2, "Business wars", "Show Wondery")
                ), true

            )

            ListsSection(
                title = "Jump back in",
                list = listOf(
                    PlayList(R.drawable.dua_lipa, "Business wars", "Show Wondery"),
                    PlayList(R.drawable.nikita, "Business wars", "Show Wondery"),
                    PlayList(R.drawable.daily_mix_1, "Business wars", "Show Wondery"),
                    PlayList(R.drawable.daily_mix_2, "Business wars", "Show Wondery")
                ), false
            )

        }
        CurrentlyPlaying(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 56.dp, start = 7.dp, end = 7.dp)
        )
    }

}

@Composable
fun Greetings() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically, modifier = Modifier
            .padding(start = 15.dp, end = 15.dp, top = 15.dp, bottom = 10.dp)
            .fillMaxWidth()
            .wrapContentHeight()

    ) {
        Text(
            text = "Good morning", color = white, fontWeight = FontWeight.Bold, fontSize = 27.sp
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.wrapContentWidth()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_notifications),
                contentDescription = "Notifications", tint = white, modifier = Modifier
                    .size(26.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_history),
                contentDescription = "History", tint = white, modifier = Modifier
                    .padding(start = 15.dp)
                    .size(26.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_settings),
                contentDescription = "Settings", tint = white, modifier = Modifier
                    .padding(start = 15.dp)
                    .size(26.dp)
            )
        }
    }
}

@Composable
fun PlayListSection(
    album1: String,
    album2: String,
    @DrawableRes albumCover1: Int,
    @DrawableRes albumCover2: Int
) {
    Column(modifier = Modifier.padding(start = 15.dp, end = 15.dp, bottom = 8.dp)) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .weight(1f)
                    .background(tileBackground)
            ) {
                Image(
                    painter = painterResource(id = albumCover1),
                    contentDescription = "PlayList", modifier = Modifier.height(55.dp)
                )
                Text(
                    text = album1,
                    color = white,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp, modifier = Modifier.padding(start = 5.dp, end = 15.dp)
                )

            }
            Spacer(Modifier.size(8.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .weight(1f)
                    .background(tileBackground)
            ) {
                Image(
                    painter = painterResource(id = albumCover2),
                    contentDescription = "Playlist", Modifier.height(55.dp)
                )
                Text(
                    text = album2,
                    color = white,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp, modifier = Modifier
                        .padding(start = 5.dp, end = 15.dp)

                )

            }

        }

    }
}

@Composable
fun ListsSection(title: String, list: List<PlayList>, isItShow: Boolean) {

    Column() {
        Text(
            text = title, color = white, fontWeight = FontWeight.Bold, fontSize = 25.sp,
            modifier = Modifier.padding(start = 15.dp, top = 15.dp, bottom = 10.dp)
        )
        LazyRow {
            items(list.size) {
                ListItem(item = list[it], isItShow)
            }
        }
    }
}

@Composable
fun ListItem(item: PlayList, isItShow: Boolean) {

    val imageModifier = if (isItShow) {
        Modifier
            .size(150.dp)
    } else {
        Modifier
            .size(150.dp)
            .clip(RoundedCornerShape(6.dp))
    }

    Column(
        modifier = Modifier
            .padding(start = 15.dp, bottom = 10.dp)
    ) {

        Image(
            painter = painterResource(id = item.res), contentDescription = "Playlist",
            modifier = imageModifier
        )
        Text(
            text = item.title,
            color = if (isItShow) white else Color(0XFF979797),
            fontWeight = if (isItShow) FontWeight.Bold else FontWeight.Normal,
            fontSize = 13.sp, modifier = Modifier.padding(top = 10.dp)

        )
        Text(
            text = item.desc,
            color = Color(0XFF979797),
            fontWeight = FontWeight.Normal,
            fontSize = 13.sp,
        )


    }
}

@Composable
fun RoundAndBoxSection(title: String, list: List<RoundAndBoxPlayList>) {

    Column() {
        Text(
            text = title, color = white, fontWeight = FontWeight.Bold, fontSize = 25.sp,
            modifier = Modifier.padding(start = 15.dp, top = 15.dp, bottom = 10.dp)
        )
        LazyRow {
            items(list.size) {
                RoundAndBoxItem(item = list[it])
            }
        }
    }
}

@Composable
fun RoundAndBoxItem(item: RoundAndBoxPlayList) {

    val imageModifier = if (item.isItArtist) {
        Modifier
            .size(150.dp)
            .clip(CircleShape)
    } else {
        Modifier
            .size(150.dp)
    }

    Column(
        horizontalAlignment = if (item.isItArtist) Alignment.CenterHorizontally else Alignment.Start,
        modifier = Modifier
            .padding(
                start = 15.dp, bottom = 10.dp
            )
    ) {

        Image(
            painter = painterResource(id = item.res), contentDescription = "Playlist",
            modifier = imageModifier
        )
        Text(
            text = item.title,
            color = white,
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp, modifier = Modifier.padding(top = 10.dp)

        )

    }
}

@Composable
fun CurrentlyPlaying(modifier: Modifier) {

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(0XFF482428))
    ) {
        LinearProgressIndicator(
            color = white,
            progress = 0.5f, modifier = Modifier
                .align(Alignment.BottomCenter)
                .height(1.8.dp)
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        )

        Image(
            painter = painterResource(R.drawable.nikita),
            contentDescription = "current_play",
            modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(2.dp))
                .fillMaxHeight()
        )

        Column(
            modifier = Modifier
                .padding(start = 60.dp)
                .fillMaxHeight()
        ) {
            Text(
                text = "Better than Ever",
                color = white,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp, modifier = Modifier.padding(top = 10.dp)

            )
            Text(
                text = "Nikita Kering'",
                color = white,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(end = 15.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_devices),
                contentDescription = "current_play_device",
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(25.dp)
                    .fillMaxHeight()
            )
            Image(
                painter = painterResource(R.drawable.ic_like),
                contentDescription = "current_play",
                modifier = Modifier
                    .size(25.dp)
                    .fillMaxHeight()
            )
            Image(
                painter = painterResource(R.drawable.ic_play),
                contentDescription = "current_play",
                modifier = Modifier
                    .size(40.dp)
                    .padding(start = 10.dp)
                    .fillMaxHeight()
            )

        }
    }
}
