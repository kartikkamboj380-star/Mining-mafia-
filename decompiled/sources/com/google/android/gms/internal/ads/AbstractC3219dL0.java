package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3219dL0 implements FM0 {
    static {
        HL0 hl0 = HL0.f19274c;
        int i10 = AbstractC3722hL0.f28900a;
    }

    @Override // com.google.android.gms.internal.ads.FM0
    public final /* synthetic */ Object a(InputStream inputStream, HL0 hl0) throws C3598gM0 {
        AbstractC5609wL0 abstractC5609wL0D = AbstractC5609wL0.d(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE);
        InterfaceC5863yM0 interfaceC5863yM0 = (InterfaceC5863yM0) b(abstractC5609wL0D, hl0);
        abstractC5609wL0D.l(0);
        if (interfaceC5863yM0 == null || interfaceC5863yM0.b()) {
            return interfaceC5863yM0;
        }
        throw (!(interfaceC5863yM0 instanceof AbstractC3093cL0) ? new ZM0(interfaceC5863yM0) : ((AbstractC3093cL0) interfaceC5863yM0).m()).a();
    }
}
