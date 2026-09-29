package com.example.volumeshortcut;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;

public class PowerService extends AccessibilityService {

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        // Vừa được bật lên là mở ngay menu Nguồn (Tắt máy / Khởi động lại)
        performGlobalAction(GLOBAL_ACTION_POWER_DIALOG);
        // Tự tắt lại chính mình để không bị bật lại menu này ngoài ý muốn
        disableSelf();
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        // Không cần xử lý gì ở đây
    }

    @Override
    public void onInterrupt() {
        // Không cần xử lý gì ở đây
    }
}
