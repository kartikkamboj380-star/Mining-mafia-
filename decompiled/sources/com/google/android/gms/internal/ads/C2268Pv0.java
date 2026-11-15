package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2268Pv0 extends C2424Sv0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final char[] f22224g;

    private C2268Pv0(C2216Ov0 c2216Ov0) {
        super(c2216Ov0, null);
        this.f22224g = new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        AbstractC2418Ss0.a(c2216Ov0.f().length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.f22224g[i10] = c2216Ov0.a(i10 >>> 4);
            this.f22224g[i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER] = c2216Ov0.a(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.C2424Sv0, com.google.android.gms.internal.ads.AbstractC2528Uv0
    final void a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        AbstractC2418Ss0.o(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            char[] cArr = this.f22224g;
            appendable.append(cArr[i13]);
            appendable.append(cArr[i13 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER]);
        }
    }

    @Override // com.google.android.gms.internal.ads.C2424Sv0, com.google.android.gms.internal.ads.AbstractC2528Uv0
    final int b(byte[] bArr, CharSequence charSequence) throws C2372Rv0 {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new C2372Rv0(sb.toString());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            C2216Ov0 c2216Ov0 = this.f23339d;
            bArr[i11] = (byte) (c2216Ov0.c(charSequence.charAt(i10 + 1)) | (c2216Ov0.c(charSequence.charAt(i10)) << 4));
            i10 += 2;
            i11++;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.C2424Sv0
    final AbstractC2528Uv0 m(C2216Ov0 c2216Ov0, Character ch) {
        return new C2268Pv0(c2216Ov0);
    }

    C2268Pv0(String str, String str2) {
        this(new C2216Ov0("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
