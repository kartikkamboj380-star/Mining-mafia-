package com.bytedance.sdk.component.oq.kq;

/* JADX INFO: loaded from: classes.dex */
public class wki {
    public dgq bob;
    public byte[] csi;
    public String fou;
    public kq rhi;

    public enum kq {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public wki() {
    }

    public static wki kq(dgq dgqVar, String str) {
        return new wki(dgqVar, str, kq.STRING_TYPE);
    }

    public wki(dgq dgqVar, String str, kq kqVar) {
        this.bob = dgqVar;
        this.fou = str;
        this.rhi = kqVar;
    }

    public static wki kq(dgq dgqVar, byte[] bArr) {
        return new wki(dgqVar, bArr, kq.BYTE_ARRAY_TYPE);
    }

    public wki(dgq dgqVar, byte[] bArr, kq kqVar) {
        this.bob = dgqVar;
        this.csi = bArr;
        this.rhi = kqVar;
    }
}
