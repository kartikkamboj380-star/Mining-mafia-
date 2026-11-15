package O;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: O.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0855h0 {

    /* JADX INFO: renamed from: O.h0$a */
    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f3840a;

        a(ViewGroup viewGroup) {
            this.f3840a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return AbstractC0855h0.b(this.f3840a);
        }
    }

    /* JADX INFO: renamed from: O.h0$b */
    public static final class b implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f3842b;

        b(ViewGroup viewGroup) {
            this.f3842b = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f3842b;
            int i10 = this.f3841a;
            this.f3841a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3841a < this.f3842b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f3842b;
            int i10 = this.f3841a - 1;
            this.f3841a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    public static final Sequence a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Iterator b(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}
