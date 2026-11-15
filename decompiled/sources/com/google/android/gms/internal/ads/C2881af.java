package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.util.Base64OutputStream;
import com.google.protobuf.CodedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2881af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f26587a = new ByteArrayOutputStream(CodedOutputStream.DEFAULT_BUFFER_SIZE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Base64OutputStream f26588b = new Base64OutputStream(this.f26587a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        try {
            this.f26588b.close();
        } catch (IOException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("HashManager: Unable to convert to Base64.", e10);
        }
        try {
            try {
                this.f26587a.close();
                string = this.f26587a.toString();
            } catch (IOException e11) {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.d("HashManager: Unable to convert to Base64.", e11);
                string = "";
            }
            return string;
        } finally {
            this.f26587a = null;
            this.f26588b = null;
        }
    }
}
