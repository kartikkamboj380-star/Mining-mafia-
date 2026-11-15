package U3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0090a f5898b = new C0090a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f5899a;

    /* JADX INFO: renamed from: U3.a$a, reason: collision with other inner class name */
    public static final class C0090a {
        public /* synthetic */ C0090a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final m b(ReadableMap readableMap, Context context) {
            if (readableMap.hasKey(HandleInvocationsFromAdViewer.KEY_AD_TYPE) && readableMap.getType(HandleInvocationsFromAdViewer.KEY_AD_TYPE) == ReadableType.String) {
                String string = readableMap.getString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
                if (Intrinsics.b(string, "linear-gradient")) {
                    return n.f5958c.a(readableMap, context);
                }
                if (Intrinsics.b(string, "radial-gradient")) {
                    return s.f6001e.a(readableMap, context);
                }
            }
            return null;
        }

        public final a a(ReadableMap readableMap, Context context) {
            m mVarB;
            Intrinsics.checkNotNullParameter(context, "context");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (readableMap == null || (mVarB = b(readableMap, context)) == null) {
                return null;
            }
            return new a(mVarB, defaultConstructorMarker);
        }

        private C0090a() {
        }
    }

    public /* synthetic */ a(m mVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar);
    }

    public final Shader a(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        m mVar = this.f5899a;
        if (mVar == null) {
            Intrinsics.r("gradient");
            mVar = null;
        }
        return mVar.a(bounds.width(), bounds.height());
    }

    public a() {
    }

    private a(m mVar) {
        this();
        this.f5899a = mVar;
    }
}
