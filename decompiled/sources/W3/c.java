package W3;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6564a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f6565b = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    private c() {
    }

    public static final String a(String message, ReadableArray stack) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(stack, "stack");
        StringBuilder sb = new StringBuilder(message);
        sb.append(", stack:\n");
        int size = stack.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = stack.getMap(i10);
            if (map != null) {
                sb.append(map.getString("methodName"));
                sb.append("@");
                sb.append(f6564a.b(map));
                if (map.hasKey("lineNumber") && !map.isNull("lineNumber") && map.getType("lineNumber") == ReadableType.Number) {
                    sb.append(map.getInt("lineNumber"));
                } else {
                    sb.append(-1);
                }
                if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                    sb.append(":");
                    sb.append(map.getInt("column"));
                }
                sb.append("\n");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String b(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String || (string = readableMap.getString("file")) == null) {
            return "";
        }
        Matcher matcher = f6565b.matcher(string);
        if (!matcher.find()) {
            return "";
        }
        return matcher.group(1) + ":";
    }
}
