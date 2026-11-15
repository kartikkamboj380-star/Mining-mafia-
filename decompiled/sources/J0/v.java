package J0;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class v implements WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f1921a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    private static I0.f[] a(InvocationHandler[] invocationHandlerArr) {
        I0.f[] fVarArr = new I0.f[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            fVarArr[i10] = new x(invocationHandlerArr[i10]);
        }
        return fVarArr;
    }

    public static I0.e b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        I0.f[] fVarArrA = a(webMessageBoundaryInterface.getPorts());
        if (!B.f1828C.c()) {
            return new I0.e(webMessageBoundaryInterface.getData(), fVarArrA);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) t9.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new I0.e(webMessagePayloadBoundaryInterface.getAsString(), fVarArrA);
        }
        if (type != 1) {
            return null;
        }
        return new I0.e(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), fVarArrA);
    }
}
