def missingWords(s, t):
    s_words = s.split()
    t_words = t.split()
    
    result = []
    j = 0  # Pointer for t_words

    for word in s_words:
        if j < len(t_words) and word == t_words[j]:
            j += 1
        else:
            result.append(word)           
    return result


if __name__ == '__main__':
    s = input().strip()
    t = input().strip()
    result = missingWords(s, t)
    print('\n'.join(result))
    
