package com.appsflyer.internal;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.CodedOutputStream;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1uSDK extends FilterInputStream {
    private long[] AFAdRevenueData;
    private int areAllFieldsValid;
    private byte[] component1;
    private int component2;
    private long[] component3;
    private short component4;
    private int copydefault;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private int getMonetizationNetwork;
    private final int getRevenue;

    public AFk1uSDK(InputStream inputStream, int i10, int i11, short s10, int i12, int i13) {
        this(inputStream, i10, i11, s10, i12, i13, (byte) 0);
    }

    private int getCurrencyIso4217Code() throws IOException {
        int i10;
        if (this.areAllFieldsValid == Integer.MAX_VALUE) {
            this.areAllFieldsValid = ((FilterInputStream) this).in.read();
        }
        if (this.component2 == this.getMediationNetwork) {
            byte[] bArr = this.component1;
            int i11 = this.areAllFieldsValid;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.component1, i12, this.getMediationNetwork - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < this.getMediationNetwork);
            if (i12 < this.getMediationNetwork) {
                throw new IllegalStateException("unexpected block size");
            }
            int i14 = this.getCurrencyIso4217Code;
            if (i14 == this.getRevenue) {
                getMediationNetwork();
            } else {
                if (this.getMonetizationNetwork <= i14) {
                    getMediationNetwork();
                }
                int i15 = this.getMonetizationNetwork;
                if (i15 < this.getRevenue) {
                    this.getMonetizationNetwork = i15 + 1;
                } else {
                    this.getMonetizationNetwork = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.areAllFieldsValid = i16;
            this.component2 = 0;
            if (i16 < 0) {
                int i17 = this.getMediationNetwork;
                i10 = i17 - (this.component1[i17 - 1] & 255);
            } else {
                i10 = this.getMediationNetwork;
            }
            this.copydefault = i10;
        }
        return this.copydefault;
    }

    private void getMediationNetwork() {
        long[] jArr = this.AFAdRevenueData;
        long[] jArr2 = this.component3;
        short s10 = this.component4;
        long j10 = jArr[s10 % 4] * 2147483085;
        long j11 = jArr2[(s10 + 2) % 4];
        int i10 = (s10 + 3) % 4;
        jArr2[i10] = ((jArr[i10] * 2147483085) + j11) / 2147483647L;
        jArr[i10] = (j10 + j11) % 2147483647L;
        for (int i11 = 0; i11 < this.getMediationNetwork; i11++) {
            byte[] bArr = this.component1;
            bArr[i11] = (byte) (((long) bArr[i11]) ^ ((this.AFAdRevenueData[this.component4] >> (i11 << 3)) & 255));
        }
        this.component4 = (short) ((this.component4 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getCurrencyIso4217Code();
        return this.copydefault - this.component2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getCurrencyIso4217Code();
        int i10 = this.component2;
        if (i10 >= this.copydefault) {
            return -1;
        }
        byte[] bArr = this.component1;
        this.component2 = i10 + 1;
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

    private AFk1uSDK(InputStream inputStream, int i10, int i11, short s10, int i12, int i13, byte b10) {
        super(new BufferedInputStream(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE));
        this.getMonetizationNetwork = 1;
        this.areAllFieldsValid = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int iMin = Math.min(Math.max((int) s10, 4), 8);
        this.getMediationNetwork = iMin;
        this.component1 = new byte[iMin];
        this.AFAdRevenueData = new long[4];
        this.component3 = new long[4];
        this.component2 = iMin;
        this.copydefault = iMin;
        this.AFAdRevenueData = AFk1vSDK.getMediationNetwork(i10 ^ i13, iMin ^ i13);
        this.component3 = AFk1vSDK.getMediationNetwork(i11 ^ i13, i12 ^ i13);
        this.getCurrencyIso4217Code = 100;
        this.getRevenue = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            getCurrencyIso4217Code();
            int i14 = this.component2;
            if (i14 >= this.copydefault) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.component1;
            this.component2 = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
