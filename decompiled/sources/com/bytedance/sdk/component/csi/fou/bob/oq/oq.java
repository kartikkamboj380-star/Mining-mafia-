package com.bytedance.sdk.component.csi.fou.bob.oq;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static final ImageView.ScaleType kq = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config oq = Bitmap.Config.ARGB_4444;
    private final Bitmap.Config bob;
    private int csi;
    private int fou;
    private final int rhi;
    private final int rjo;
    private final ImageView.ScaleType syt;
    private final int dgq = 1280;
    private final int nn = 83886080;

    public oq(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.bob = config;
        this.fou = i10;
        this.csi = i11;
        this.syt = scaleType;
        this.rhi = i12;
        this.rjo = i13;
        kq(i10, i11);
    }

    private static int kq(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (i10 == 0) {
            return (int) (((double) i12) * (((double) i11) / ((double) i13)));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = ((double) i13) / ((double) i12);
        double d11 = i11;
        return ((double) i10) * d10 > d11 ? (int) (d11 / d10) : i10;
    }

    static int kq(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dMin = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        if (i14 > 0 && i15 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i10, i11)) / ((double) Math.max(i14, i15)), ((double) Math.min(i10, i11)) / ((double) Math.min(i14, i15))));
        }
        return Integer.highestOneBit((int) dMin);
    }

    public Bitmap kq(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.fou == 0 && this.csi == 0) {
            options.inPreferredConfig = this.bob;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iKq = kq(this.fou, this.csi, i10, i11);
            int iKq2 = kq(this.csi, this.fou, i11, i10);
            options.inJustDecodeBounds = false;
            options.inSampleSize = kq(i10, i11, iKq, iKq2, this.rhi, this.rjo);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iKq || bitmapDecodeByteArray.getHeight() > iKq2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iKq, iKq2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 83886080) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    private void kq(int i10, int i11) {
        if (i10 > 1280 && i11 > 1280) {
            if (i10 > i11) {
                this.fou = 1280;
                this.csi = (i11 * 1280) / i10;
                return;
            } else {
                this.fou = (i10 * 1280) / i11;
                this.csi = 1280;
                return;
            }
        }
        if (i10 > 1280) {
            this.fou = 1280;
            this.csi = (i11 * 1280) / i10;
        } else if (i11 > 1280) {
            this.fou = (i10 * 1280) / i11;
            this.csi = 1280;
        }
    }
}
