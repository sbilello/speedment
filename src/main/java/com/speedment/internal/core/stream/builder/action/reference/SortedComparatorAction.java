/**
 *
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.internal.core.stream.builder.action.reference;

import static com.speedment.internal.core.stream.builder.action.StandardBasicAction.SORTED;
import com.speedment.internal.core.stream.builder.action.trait.HasComparator;
import com.speedment.stream.action.Action;
import java.util.Comparator;
import static java.util.Objects.requireNonNull;
import java.util.stream.Stream;

/**
 *
 * @author pemi
 * @param <T> the type of the stream elements
 */
public final class SortedComparatorAction<T> extends Action<Stream<T>, Stream<T>> implements HasComparator<T> {

    public final Comparator<? super T> comparator;

    public SortedComparatorAction(Comparator<? super T> comparator) {
        super(s -> s.sorted(requireNonNull(comparator)), Stream.class, SORTED);
        this.comparator = comparator;
    }

    @Override
    public Comparator<? super T> getComparator() {
        return comparator;
    }

}