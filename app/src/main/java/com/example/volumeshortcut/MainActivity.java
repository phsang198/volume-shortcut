package com.example.volumeshortcut;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AudioManager am = (AudioManager) getSystemService(AUDIO_SERVICE);
        // ADJUST_SAME + FLAG_SHOW_UI = không đổi âm lượng, chỉ hiện thanh trượt
        am.adjustStreamVolume(
                AudioManager.STREAM_MUSIC,
                AudioManager.ADJUST_SAME,
                AudioManager.FLAG_SHOW_UI);

        finish();
    }
}
