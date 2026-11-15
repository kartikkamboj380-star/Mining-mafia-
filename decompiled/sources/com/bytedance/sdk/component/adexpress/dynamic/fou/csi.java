package com.bytedance.sdk.component.adexpress.dynamic.fou;

import android.text.TextUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    public static final Map<String, Integer> kq;
    private String bob;
    private rhi csi;
    private rhi fou;
    private String oq;
    private String rhi;

    static {
        HashMap map = new HashMap();
        kq = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put("title", 0);
        map.put("subtitle", 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        map.put("text", 0);
        map.put("tag-group", 17);
        map.put("app-version", 0);
        map.put("development-name", 0);
        map.put("privacy-detail", 23);
        map.put("image", 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        map.put("icon-download", 1);
        map.put("logoad", 4);
        map.put("logounion", 5);
        map.put("logo-union", 9);
        map.put("dislike", 3);
        map.put("close", 3);
        map.put("close-fill", 3);
        map.put("webview-close", 22);
        map.put("feedback-dislike", 12);
        map.put("button", 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put("vessel", 6);
        map.put("image-group", 6);
        map.put("custom-component-vessel", 6);
        map.put("carousel", 24);
        map.put("carousel-vessel", 26);
        map.put("leisure-interact", 25);
        map.put("video-hd", 7);
        map.put(MimeTypes.BASE_TYPE_VIDEO, 7);
        map.put("video-vd", 7);
        map.put("video-sq", 7);
        map.put("muted", 10);
        map.put("star", 11);
        map.put("skip-countdowns", 19);
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        map.put("skip-with-countdowns-skip-countdown", 20);
        map.put("skip-with-time", 14);
        map.put("skip-with-time-countdown", 13);
        map.put("skip-with-time-skip-btn", 15);
        map.put("skip", 27);
        map.put("timedown", 13);
        map.put("icon", 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        map.put("score-count-type-2", 0);
        map.put("lottie", 28);
    }

    public String bob() {
        return this.bob;
    }

    public rhi csi() {
        return this.fou;
    }

    public String fou() {
        return this.rhi;
    }

    public int kq() {
        if (TextUtils.isEmpty(this.oq)) {
            return 0;
        }
        if (this.oq.equals("logo")) {
            String str = this.oq + this.bob;
            this.oq = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.oq.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = kq;
        if (map.get(this.oq) != null) {
            return map.get(this.oq).intValue();
        }
        return -1;
    }

    public String oq() {
        return this.oq;
    }

    public int rhi() {
        return this.fou.wxb();
    }

    public rhi rjo() {
        return this.csi;
    }

    public String toString() {
        return "DynamicLayoutBrick{type='" + this.oq + "', data='" + this.bob + "', value=" + this.fou + ", themeValue=" + this.csi + ", dataExtraInfo='" + this.rhi + "'}";
    }

    public void bob(String str) {
        this.rhi = str;
    }

    public void oq(String str) {
        this.bob = str;
    }

    public void oq(rhi rhiVar) {
        this.csi = rhiVar;
    }

    public void kq(String str) {
        this.oq = str;
    }

    public void kq(rhi rhiVar) {
        this.fou = rhiVar;
    }
}
