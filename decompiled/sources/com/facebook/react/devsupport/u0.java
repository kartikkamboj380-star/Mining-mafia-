package com.facebook.react.devsupport;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.File;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f14791a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f14792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f14793c;

    static {
        Pattern patternCompile = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        f14792b = patternCompile;
        Pattern patternCompile2 = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "compile(...)");
        f14793c = patternCompile2;
    }

    private u0() {
    }

    public static final p124m3.j[] a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        StackTraceElement[] stackTrace = exception.getStackTrace();
        int length = stackTrace.length;
        p124m3.j[] jVarArr = new p124m3.j[length];
        for (int i10 = 0; i10 < length; i10++) {
            String className = stackTrace[i10].getClassName();
            String fileName = stackTrace[i10].getFileName();
            String methodName = stackTrace[i10].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "getMethodName(...)");
            jVarArr[i10] = new a(className, fileName, methodName, stackTrace[i10].getLineNumber(), -1, false, 32, null);
        }
        return jVarArr;
    }

    public static final JavaOnlyMap b(ReactJsExceptionHandler.ProcessedError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (ReactJsExceptionHandler.ProcessedError.StackFrame stackFrame : error.getStack()) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            Integer column = stackFrame.getColumn();
            if (column != null) {
                javaOnlyMap.putDouble("column", column.intValue());
            }
            Integer lineNumber = stackFrame.getLineNumber();
            if (lineNumber != null) {
                javaOnlyMap.putDouble("lineNumber", lineNumber.intValue());
            }
            javaOnlyMap.putString("file", stackFrame.getFile());
            javaOnlyMap.putString("methodName", stackFrame.getMethodName());
            javaOnlyArray.pushMap(javaOnlyMap);
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putString(PglCryptUtils.KEY_MESSAGE, error.getMessage());
        String originalMessage = error.getOriginalMessage();
        if (originalMessage != null) {
            javaOnlyMap2.putString("originalMessage", originalMessage);
        }
        String name = error.getName();
        if (name != null) {
            javaOnlyMap2.putString(MediationMetaData.KEY_NAME, name);
        }
        String componentStack = error.getComponentStack();
        if (componentStack != null) {
            javaOnlyMap2.putString("componentStack", componentStack);
        }
        javaOnlyMap2.putArray("stack", javaOnlyArray);
        javaOnlyMap2.putInt("id", error.getId());
        javaOnlyMap2.putBoolean("isFatal", error.isFatal());
        javaOnlyMap2.putMap("extraData", error.getExtraData());
        return javaOnlyMap2;
    }

    public final String c(p124m3.j frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        StringBuilder sb = new StringBuilder();
        sb.append(frame.getFileName());
        int iA = frame.a();
        if (iA > 0) {
            sb.append(":");
            sb.append(iA);
            int column = frame.getColumn();
            if (column > 0) {
                sb.append(":");
                sb.append(column);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final class a implements p124m3.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f14794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f14795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f14796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f14797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f14798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f14799f;

        public a(String str, String str2, String method, int i10, int i11, boolean z9) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.f14794a = str;
            this.f14795b = str2;
            this.f14796c = method;
            this.f14797d = i10;
            this.f14798e = i11;
            this.f14799f = z9;
        }

        @Override // p124m3.j
        public int a() {
            return this.f14797d;
        }

        @Override // p124m3.j
        public boolean b() {
            return this.f14799f;
        }

        @Override // p124m3.j
        public int getColumn() {
            return this.f14798e;
        }

        @Override // p124m3.j
        public String getFile() {
            return this.f14794a;
        }

        @Override // p124m3.j
        public String getFileName() {
            return this.f14795b;
        }

        @Override // p124m3.j
        public String getMethod() {
            return this.f14796c;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, String str2, String str3, int i10, int i11, boolean z9, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i12 & 2) != 0) {
                str2 = str != null ? new File(str).getName() : null;
            }
            this(str, str2, str3, i10, i11, (i12 & 32) != 0 ? false : z9);
        }
    }
}
