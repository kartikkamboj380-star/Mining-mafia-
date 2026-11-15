package Z;

import W.C0979d;
import androidx.datastore.preferences.protobuf.C1125v;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7080a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(InputStream input) throws C0979d {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                f fVarR = f.R(input);
                Intrinsics.checkNotNullExpressionValue(fVarR, "{\n                Prefer…From(input)\n            }");
                return fVarR;
            } catch (C1125v e10) {
                throw new C0979d("Unable to parse preferences proto.", e10);
            }
        }

        private a() {
        }
    }
}
