package com.bytedance.sdk.openadsdk.fou;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static final String kq = com.bytedance.sdk.openadsdk.fou.bob.kq.InterfaceC0299kq.kq;
    public static final String oq = com.bytedance.sdk.openadsdk.fou.bob.kq.InterfaceC0299kq.oq;
    public static final String bob = com.bytedance.sdk.openadsdk.fou.bob.kq.InterfaceC0299kq.bob;
    public static final String fou = com.bytedance.sdk.openadsdk.fou.bob.kq.InterfaceC0299kq.fou;
    public static final String csi = com.bytedance.sdk.openadsdk.fou.bob.kq.InterfaceC0299kq.csi;
    public static final String rhi = com.bytedance.sdk.openadsdk.fou.bob.kq.InterfaceC0299kq.rhi;
    public static final Set<String> rjo = new HashSet(Arrays.asList("click", "show", "insight_log"));

    public static class kq {
        public static String bob = "direct";
        public static String fou = "saLandingPageLinks";
        public static String kq = "openDetailPage";
        public static String oq = "openAdLandPageLinks";
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.fou.oq$oq, reason: collision with other inner class name */
    public static class C0303oq {
        public static int bob = 100;
        public static int kq = 1;
        public static int oq = 2;
    }

    public static boolean kq(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
