package com.bytedance.sdk.openadsdk.core.vvw.bob;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public static final Set<String> kq = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.vvw.bob.kq.1
        {
            add(ClipboardModule.MIMETYPE_JPEG);
            add(ClipboardModule.MIMETYPE_PNG);
            add("image/bmp");
            add("image/gif");
            add(ClipboardModule.MIMETYPE_JPG);
        }
    };
    public static Set<String> oq = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.vvw.bob.kq.2
        {
            add("application/x-javascript");
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.vvw.bob.kq$kq, reason: collision with other inner class name */
    public enum EnumC0289kq {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public enum oq {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    @NonNull
    public static Point kq(Context context, int i10, int i11, oq oqVar) {
        if (context == null) {
            context = sns.kq();
        }
        Point point = new Point(i10, i11);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iOq = bss.oq(context, i10);
        int iOq2 = bss.oq(context, i11);
        if (iOq > width || iOq2 > height) {
            Point point2 = new Point();
            if (oq.HTML_RESOURCE == oqVar) {
                point2.x = Math.min(width, iOq);
                point2.y = Math.min(height, iOq2);
            } else {
                float f10 = iOq;
                float f11 = f10 / width;
                float f12 = iOq2;
                float f13 = f12 / height;
                if (f11 >= f13) {
                    point2.x = width;
                    point2.y = (int) (f12 / f11);
                } else {
                    point2.x = (int) (f10 / f13);
                    point2.y = height;
                }
            }
            int i12 = point2.x;
            if (i12 >= 0 && point2.y >= 0) {
                point2.x = bss.bob(context, i12);
                point2.y = bss.bob(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
