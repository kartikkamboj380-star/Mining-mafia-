package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4691p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f32278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f32279b;

    public C4691p3() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
        this.f32278a = byteArrayOutputStream;
        this.f32279b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(C4565o3 c4565o3) {
        ByteArrayOutputStream byteArrayOutputStream = this.f32278a;
        byteArrayOutputStream.reset();
        try {
            DataOutputStream dataOutputStream = this.f32279b;
            b(dataOutputStream, c4565o3.f31948a);
            b(dataOutputStream, c4565o3.f31949b);
            dataOutputStream.writeLong(c4565o3.f31950c);
            dataOutputStream.writeLong(c4565o3.f31951d);
            dataOutputStream.write(c4565o3.f31952e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
