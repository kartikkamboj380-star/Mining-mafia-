package G8;

import java.util.Iterator;
import kotlin.collections.y;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class e implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f1065a = new e();

    private e() {
    }

    @Override // G8.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e a(int i10) {
        return f1065a;
    }

    @Override // G8.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(int i10) {
        return f1065a;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return y.f45948a;
    }
}
