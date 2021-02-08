# Краткое описание счетчиков INSTRUCTION, BRANCH, LINE, COMPLEXITY

## INSTRUCTION

INSTRUCTION - одиночная инструкция кода байта Java. Покрытие инструкции предоставляет информацию о количестве кода, который был выполнен или пропущен.

## BRANCH

BRANCH вычислает охват веток для всех операторов if и switch. Эта метрика подсчитывает общее количество таких ветвей в методе и определяет количество выполненных или пропущенных ветвей.

## LINE

LINE рассчитывает информацию о покрытии для отдельных строк кода. Исходная строка считается выполненной, когда была выполнена хотя бы одна команда, назначенная этой строке.

## COMPLEXITY

COMPLEXITY вычисляет цикломатическую сложность для каждого неабстрактного метода и суммирует сложность для классов, пакетов и групп. Служит индикатором количества примеров модульного тестирования, которые полностью охватывают определенную часть программного обеспечения.
