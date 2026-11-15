package com.appsflyer.internal;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.CodedOutputStream;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private int AFAdRevenueData;
    private int[] areAllFieldsValid;
    private byte[] component1;
    private byte[] component2;
    private byte[] component3;
    private int component4;
    private int equals;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private AFk1xSDK getRevenue;
    private int hashCode;
    private int toString;

    public AFk1tSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i10, boolean z9, int i11) {
        this(inputStream, iArr, bArr, i10, false, i11, (byte) 0);
    }

    private int AFAdRevenueData() throws IOException {
        if (this.hashCode == Integer.MAX_VALUE) {
            this.hashCode = ((FilterInputStream) this).in.read();
        }
        if (this.component4 == 8) {
            byte[] bArr = this.component1;
            int i10 = this.hashCode;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.component1, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.getMonetizationNetwork;
            if (i13 == this.getMediationNetwork) {
                getMediationNetwork();
            } else {
                if (this.AFAdRevenueData <= i13) {
                    getMediationNetwork();
                }
                int i14 = this.AFAdRevenueData;
                if (i14 < this.getMediationNetwork) {
                    this.AFAdRevenueData = i14 + 1;
                } else {
                    this.AFAdRevenueData = 1;
                }
            }
            int i15 = ((FilterInputStream) this).in.read();
            this.hashCode = i15;
            this.component4 = 0;
            this.equals = i15 < 0 ? 8 - (this.component1[7] & 255) : 8;
        }
        return this.equals;
    }

    private void getMediationNetwork() {
        if (this.toString == 2) {
            byte[] bArr = this.component1;
            System.arraycopy(bArr, 0, this.component3, 0, bArr.length);
        }
        byte[] bArr2 = this.component1;
        int i10 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = this.getCurrencyIso4217Code;
        AFk1xSDK aFk1xSDK = this.getRevenue;
        AFk1rSDK.getRevenue(i10, i11, false, i12, aFk1xSDK.getCurrencyIso4217Code, aFk1xSDK.AFAdRevenueData, this.areAllFieldsValid);
        int[] iArr = this.areAllFieldsValid;
        int i13 = iArr[0];
        int i14 = iArr[1];
        byte[] bArr3 = this.component1;
        bArr3[0] = (byte) (i13 >> 24);
        bArr3[1] = (byte) (i13 >> 16);
        bArr3[2] = (byte) (i13 >> 8);
        bArr3[3] = (byte) i13;
        bArr3[4] = (byte) (i14 >> 24);
        bArr3[5] = (byte) (i14 >> 16);
        bArr3[6] = (byte) (i14 >> 8);
        bArr3[7] = (byte) i14;
        if (this.toString == 2) {
            for (int i15 = 0; i15 < 8; i15++) {
                byte[] bArr4 = this.component1;
                bArr4[i15] = (byte) (bArr4[i15] ^ this.component2[i15]);
            }
            byte[] bArr5 = this.component3;
            System.arraycopy(bArr5, 0, this.component2, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFAdRevenueData();
        return this.equals - this.component4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFAdRevenueData();
        int i10 = this.component4;
        if (i10 >= this.equals) {
            return -1;
        }
        byte[] bArr = this.component1;
        this.component4 = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private AFk1tSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i10, boolean z9, int i11, byte b10) {
        super(new BufferedInputStream(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE));
        this.AFAdRevenueData = 1;
        this.hashCode = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int iMin = Math.min(Math.max(i10, 3), 16);
        this.getCurrencyIso4217Code = iMin;
        this.component1 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.component2 = bArr2;
        this.component3 = new byte[8];
        this.areAllFieldsValid = new int[2];
        this.component4 = 8;
        this.equals = 8;
        this.toString = i11;
        if (i11 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getRevenue = new AFk1xSDK(iArr, iMin, true, false);
        this.getMonetizationNetwork = 100;
        this.getMediationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFAdRevenueData();
            int i14 = this.component4;
            if (i14 >= this.equals) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.component1;
            this.component4 = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
