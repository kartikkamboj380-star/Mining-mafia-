package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes.dex */
public class TTImage {
    private final String bob;
    private double fou;
    private final int kq;
    private final int oq;

    public TTImage(int i10, int i11, String str, double d10) {
        this.kq = i10;
        this.oq = i11;
        this.bob = str;
        this.fou = d10;
    }

    public double getDuration() {
        return this.fou;
    }

    public int getHeight() {
        return this.kq;
    }

    public String getImageUrl() {
        return this.bob;
    }

    public int getWidth() {
        return this.oq;
    }

    public boolean isValid() {
        String str;
        return this.kq > 0 && this.oq > 0 && (str = this.bob) != null && str.length() > 0;
    }

    public TTImage(int i10, int i11, String str) {
        this(i10, i11, str, 0.0d);
    }
}
